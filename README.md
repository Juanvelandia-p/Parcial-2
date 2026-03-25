Juan Sebastian Velandia Pedraza

# Parcial 2 TDSE
Para el desarrrollo de este parcial se necesitaran dos proyectos de spring, uno para el calculo de la secuencia de pell y otro para el proxy server; asi que vamos por partes.

## Calculo de la secuencia de pell
Aqui lo que se hizo fue construir un controlador REST con un endpoint GET /pellseq donde se va a calcular la secuencia, y para que el JSON entregado cumpliera con lo solicitado, 
se creo una clase modelo llamada ResponsePellSeq, que contiene la estructura para que la respuesta sea igual a la requerida:

<img width="861" height="543" alt="image" src="https://github.com/user-attachments/assets/9fdaf707-68ee-489f-a428-ce74e3969238" />

Ahora para garantizar un entorno estable y que el despliegue en aws fuese exitoso, se realizo una imagen  en docker, para despues subirla a docker hub, y correr un contenedor que corriese en
las dos instancias de ec2 solicitadas:
### Primera instancia:
<img width="857" height="515" alt="image" src="https://github.com/user-attachments/assets/5cc7f016-23d7-4c8d-aba4-8b06752abcd8" />
### Segunda instancia:
<img width="864" height="596" alt="image" src="https://github.com/user-attachments/assets/280fd9a5-17e8-43a5-a337-cec542d88c98" />

## Servidor proxy
Para esto se contruyo un index.html en la carpeta static, para garantizar que se mostraba apenas abrir el puerto 8080, luego se construyo un proxy que procese la solicitud y la envie por medio de http
a alguna de las instancias, igualmente esto tambien esta dockerizado y corriendo en una instancia de ec2:
<img width="822" height="293" alt="image" src="https://github.com/user-attachments/assets/2394f3af-f895-4788-88f5-65766d94519b" />

## Prueba de funcionamiento
Adjunto video del funcionamiento del proxy corriendo en AWS


https://github.com/user-attachments/assets/6ef868d4-c2f9-4aa6-b62e-d7b9efcbdb2d





