/*
 * Este programa esta creado para el Arduino Mega 2560.
 * El objetivo de este programa es medir la distancia desde
 * el sensor de ultrasonido hasta un objecto. La distancia se encender
 * usa como parametro para encender una serie de LEDs.
 * Se recomienda que se lea TODOS los comentarios.
 * Ejemplo: Si el objecto esta a 20cm de distancia, prender led
 * verde y rojo
 *
 * La libreria Servo.h contiene la clase Servo y me permite controlar
 * el servo motor. Dentro de esta 'clase' se encuentran varios metodos
 * como por ejemplo "attach()" y "write()"
 */
#include <Servo.h>

/*
 * Primero definimos constantes para nombrar los  "Pins" utilizados
 * por el sensor de ultrasonido.
 * El sensor de ultrasonido tiene dos "Pins", uno de ellos es
 * el pin de "trigger", este se utiliza activar ultrasonido,
 * mientras que el pin de "echo" se usa para recibir la informacion
 * generada por el sensor.
 */
const int trigPin = 10;
const int echoPin = 11;

/* Aqui se definen constantes para definir los "Pins" para
 *los LEDs que vamos a estar utilizando.*/
const int greenLed = 53;
const int yellowLed = 49;
const int redLed = 45;


 /*A continuación se definen las varables que se van a utilizar para
  *tiempo y distancia en el proceso de medición
  */
long duration; // Tiempo en recibir un eco luego de generar el ultrasonido
int distance;  // Para guardar la distancia calculada

// Aqui se instancia el objeto para el servo motor.
Servo myServo;

/*
 * La funcion "setup()" se ejecuta una sola vez al inicio del programa.
 * La usaremos para configurar los "pins" que se van a
 * estar utilizando y si estos seran utilizados como output (salida) o
 * input (entrada).
 * En esta parte del codigo se puede poner lo que sea que se quiere
 * que corra solamente una vez al principio de la ejecucion.
 */
void setup() {
  pinMode(trigPin, OUTPUT);// Sets the trigPin as an Output
  pinMode(echoPin, INPUT); // Sets the echoPin as an Input
  Serial.begin(9600);      // Sets the comunication rate with the serial port
  myServo.attach(12);      // Defines on which pin is the servo motor attached

  // Setting the distance leds
  pinMode(greenLed, OUTPUT); // Sets the greenLed pin as an Output
  pinMode(yellowLed, OUTPUT);// Sets the yellowLed pin as an Output
  pinMode(redLed, OUTPUT);   // Sets the redLed pin as an Output
}
void loop() {
  /* To Do:
   *  rotates the servo motor from 15 to 165 degrees and include inside
   *  the logic to measure and turn on/off the ligths
   */
   for (int i = 15; i <= 165; i++) {
     myServo.write(i);
     delay(30);
     distance = calculateDistance();// Calls a function to calculate the distance

     // Calls the function that sends data to the serial Port
     setDataToCom(i, distance);

     // Call the function
     activateLeds(distance);
   }

   int angle = 165;
   while (angle > 15) {
     myServo.write(angle);
     delay(30);
     distance = calculateDistance();
     setDataToCom(angle, distance);
     activateLeds(distance);
     angle--;
   }
}

// Function to turns off all of the Leds
void turnOffLeds() {
  digitalWrite(greenLed, LOW); //Turn off greenLed
  digitalWrite(yellowLed, LOW);//Turn off yellow Led
  digitalWrite(redLed, LOW);   //Turn off red Led
}

/* Function to calculate the distance using the
 *  time measured by the Ultrasonic sensor
 */
int calculateDistance() {
  digitalWrite(trigPin, LOW); //Turn off the trigPin
  delayMicroseconds(2);       //Wait for two microseconds
  // Sets the trigPin on HIGH state for 10 micro seconds
  digitalWrite(trigPin, HIGH); //Sendd the unltrasound for 10 microseconds
  delayMicroseconds(10);    //Wait for 10 microseconds
  digitalWrite(trigPin, LOW); //stop sending the ultrasound
  // Read the echoPin, returns the sound wave travel time in microseconds
  duration = pulseIn(echoPin, HIGH);
  distance = duration * 0.034 / 2; // calculate the distance
  return distance;
}

void activateLeds(int pDistance) {
    if (pDistance > 100) {
      turnOffLeds();
    } else {
      if (pDistance > 60) {
        turnOffLeds();
        digitalWrite(greenLed, HIGH);
      } else {
        if (pDistance > 30) {
          turnOffLeds();
          digitalWrite(greenLed, HIGH);
          digitalWrite(yellowLed, HIGH);
        } else {
          turnOffLeds();
          digitalWrite(greenLed, HIGH);
          digitalWrite(yellowLed, HIGH);
          digitalWrite(redLed, HIGH);
        }
      }
    }
}

// Function to change data to the Serial Port
void setDataToCom(int angle, int pDistance) {
  Serial.print(angle);
  // Sends addition character right next to the previous value needed later ...
  Serial.print(",");
  // Sends the distance value into the Serial Port
  Serial.print(pDistance);
  // Sends addition character right next to the previous value needed later ...
  Serial.print(".");
  Serial.println();
}
