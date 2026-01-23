Este proyecto corresponde a la Hoja de Trabajo No. 1 del curso Algoritmos y Estructura de Datos. Consiste en la implementación de un simulador de radio de automóvil en Java, basado en el ejercicio 1.13 del libro Java Structures.

El programa permite simular el comportamiento básico de un radio real: encenderlo y apagarlo, cambiar entre bandas AM y FM, recorrer las emisoras disponibles y guardar frecuencias en botones programables. El enfoque principal del proyecto es aplicar interfaces, buen diseño orientado a objetos y reutilización de código.


Objetivos del trabajo

Con este proyecto se busca:

* Practicar el uso de Git y GitHub como control de versiones.
* Definir e implementar interfaces en Java.
* Aplicar JUnit para la creación de pruebas unitarias.
* Reforzar el uso de diagramas UML de clases.
* Repasar conceptos fundamentales del lenguaje Java.


El radio permite realizar las siguientes acciones:

1. Encender el radio.
2. Cambiar entre las bandas AM y FM.
3. Avanzar por el dial de emisoras (al llegar al límite, el dial inicia nuevamente).
4. Guardar una emisora en uno de los 12 botones disponibles.
5. Seleccionar una emisora previamente guardada en un botón.
6. Apagar el radio.

Rangos de frecuencia

AM: múltiplos de 10 entre 530 y 1610.
FM: múltiplos de 0.2 entre 87.9 y 107.9.






Compilación y ejecución

El programa está diseñado para ejecutarse desde la línea de comandos, sin depender de un IDE específico.

El proyecto incluye pruebas unitarias** desarrolladas con JUnit, las cuales permiten verificar el correcto funcionamiento de las operaciones principales del radio.

Se cuenta con evidencia de:

* Pruebas que fallan.
* Pruebas que se ejecutan correctamente.

