//i2c Slave Code (Uno)
#include <Wire.h>
 
void setup()
{
  Wire.begin(84);
  Wire.onReceive(receiveEvent);
  Serial.begin(9600);
 
  pinMode(13,OUTPUT);
  digitalWrite(13,LOW);
}
 
void loop()
{
}
 
void receiveEvent(int howMany)
{
  while(Wire.available())
  {
    char c = Wire.read();
    Serial.println(c, DEC);
    if(c == 72) digitalWrite(13,HIGH);
    else if(c == 76) digitalWrite(13,LOW);
  }
}
