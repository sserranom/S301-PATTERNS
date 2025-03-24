# Patterns

Este proyecto demuestra la implementación de varios patrones de diseño en Java, incluyendo Singleton, Abstract Factory y Command.

## Tabla de Contenidos

* [Descripción](#descripción)
* [Nivel 1: Singleton](#nivel-1-singleton)
* [Nivel 2: Abstract Factory](#nivel-2-abstract-factory)
* [Nivel 3: Command](#nivel-3-command)


## Nivel 1: Singleton

### Comando 'Undo'

Crea una clase que replique el funcionamiento del comando 'Undo'. Esta clase será utilizada por la clase Main, que permitirá introducir opciones por consola.

La clase 'Undo' debe guardar los últimos pedidos introducidos. Debe permitir añadir o eliminar pedidos, así como listar los últimos pedidos introducidos (similar al comando 'history' en Linux).

La clase 'Undo' debe implementar imprescindiblemente un patrón Singleton.

* **Clase Undo**: Implementa el patrón Singleton para asegurar que solo exista una instancia de la clase.
* **Métodos**:
    * `addCommand(String command)`: Añade un comando a la lista.
    * `removeCommand(int index)`: Elimina un comando de la lista por su índice.
    * `listCommands()`: Lista todos los comandos almacenados.
* **Clase Main**: Permite al usuario interactuar con la clase Undo a través de la consola, permitiendo añadir, eliminar y listar comandos.

## Nivel 2: Abstract Factory

### Gestor de Direcciones y Números de Teléfono Internacionales

Crea un pequeño gestor de direcciones y números de teléfono internacionales.

La aplicación debe permitir añadir a la agenda, direcciones y números de teléfono internacionales. Teniendo en cuenta los distintos formatos de los distintos países, construye la agenda, las direcciones y los teléfonos implementando un patrón Abstract Factory.

* **Interfaz AddressBookFactory**: Define los métodos para crear direcciones y números de teléfono.
* **Clases NationalAddressBookFactory e InternationalAddressBookFactory**: Implementan la interfaz AddressBookFactory para crear direcciones y números de teléfono nacionales e internacionales respectivamente.
* **Interfaz Address y PhoneNumber**: Definen los métodos para obtener la representación de una dirección y un número de teléfono.
* **Clases NationalAddress, InternationalAddress, NationalPhoneNumber e InternationalPhoneNumber**: Implementan las interfaces Address y PhoneNumber para representar direcciones y números de teléfono nacionales e internacionales.
* **Clase AddressBook**: Utiliza la fábrica abstracta para crear y mostrar direcciones y números de teléfono.
* **Clase Main**: Demuestra el uso de las fábricas para crear agendas de direcciones y números de teléfono nacionales e internacionales.

## Nivel 3: Command

### Parking de Vehículos

Diseña un parking de 4 vehículos: un coche, una bicicleta, un avión y un barco.

Muestra cómo funciona el patrón Command que implementa los métodos arrancar, acelerar y frenar para cada tipo de vehículo.

* **Interfaz Command**: Define el método `execute()` que será implementado por los comandos concretos.
* **Clases StartCommand, AcelerateCommand y BarakeCommand**: Implementan la interfaz Command para representar los comandos de arrancar, acelerar y frenar respectivamente.
* **Clase Vehicle**: Define los métodos abstractos `start()`, `acelerate()` y `brake()` que serán implementados por los vehículos concretos.
* **Clases Car, Bicycle, Boat y Airplane**: Heredan de la clase Vehicle e implementan los métodos abstractos para representar los vehículos concretos.
* **Clase Parking**: Ejecuta los comandos que se le pasan.
* **Clase Main**: Crea los vehículos y los comandos, y los ejecuta a través de la clase Parking.
