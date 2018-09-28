#include <Servo.h>

const int trigPin = 10;
const int echoPin = 11;

const int greenLed = 53;
const int yellowLed = 49;
const int redLed = 45;

long duration;
int distance;

Servo myServo;

void setup() {
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);
  Serial.begin(9600);
  myServo.attach(12);

  pinMode(greenLed, OUTPUT);
  pinMode(yellowLed, OUTPUT);
  pinMode(redLed, OUTPUT);
}

void loop() {
  delay(30);
  distance = calculateDistance();

  Serial.print(",");
  Serial.print(distance);
  Serial.print(".");

  if (distance > 100) {
    turnOffLeds();
  } else {
    if (distance >= 60) {
      turnOffLeds();
      digitalWrite(greenLed, HIGH);
    }
    else {
      if (distance >= 30) {
        turnOffLeds();
        digitalWrite(greenLed, HIGH);
        digitalWrite(yellowLed, HIGH);
      }
      else {
        turnOffLeds();
        digitalWrite(greenLed, HIGH);
        digitalWrite(yellowLed, HIGH);
        digitalWrite(redLed, HIGH);
      }
    }
  }
}

void turnOffLeds() {
  digitalWrite(greenLed, LOW);
  digitalWrite(yellowLed, LOW);
  digitalWrite(redLed, LOW);
}

int calculateDistance() {
  digitalWrite(trigPin, LOW);
  delayMicroseconds(2);
  digitalWrite(trigPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin, LOW);
  duration = pulseIn(echoPin, HIGH);
  distance = duration * 0.034 / 2;
  return distance;
}
