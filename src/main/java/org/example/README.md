# Factory Method

## Modelo

### Sistema de Gestión de Pedidos en un Restaurante

Un restaurante desea implementar un sistema para gestionar los pedidos de sus clientes. Cada cliente puede realizar uno o más pedidos, y cada pedido puede incluir uno o varios platillos del menú. El restaurante necesita un sistema centralizado que registre y gestione los pedidos de manera eficiente, evitando inconsistencias y asegurando que todos los pedidos sean almacenados y procesados en un único punto.
El sistema debe cumplir con los siguientes requisitos:
- Clientes: Cada cliente tiene un nombre y un identificador único.
- Platillos: Cada platillo tiene un nombre y un precio. 
- Pedidos: Cada pedido debe estar asociado a un cliente y contener una lista de platillos solicitados. 
- Gestión Centralizada: Todos los pedidos deben ser gestionados por un sistema único que garantice que los datos se almacenen de manera centralizada y no exista duplicidad en la lógica del negocio. 
- Reportes: El sistema debe permitir registrar nuevos pedidos y generar un listado de todos los pedidos registrados, incluyendo los detalles del cliente y los platillos solicitados.
      
Condición clave: El sistema de gestión de pedidos debe implementarse utilizando el patrón Singleton, asegurando que exista una única instancia de este sistema durante la ejecución del programa. 

El objetivo es proporcionar una solución eficiente, centralizada y fácil de mantener para gestionar los pedidos del restaurante

## Diapositivas

[Ver diapositivas](https://docs.google.com/presentation/d/1lo8sbARUju-HRo3peWd9VAVIig9WQG-f/edit?usp=sharing&ouid=102694061966033743557&rtpof=true&sd=true)

## Diagrama de Clases

[Draw.io](https://drive.google.com/file/d/1i7sbsfBUSs8qJQnnr25dsCL4M1sLQUXS/view?usp=sharing)
