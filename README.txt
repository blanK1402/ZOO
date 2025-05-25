+-----------------------+
|       Persona        |
+-----------------------+
| - nombre: String      |
| - edad: int           |
| - identificacion: String |
+-----------------------+
| + mostrarInformacion(): void |
+-----------------------+
         ▲
         │                                  ▲
         │                                  │  
+------------------------+      +----------------------+
|      Empleado         |      |      Cliente        |
+------------------------+      +----------------------+
| - cargo: String       |      | - numeroVisitas: int  |
| - salario: double     |      | - esMiembro: boolean |
+------------------------+      +----------------------+
| + mostrarInformacion(): void |
+------------------------+      +----------------------+

+----------------------+
|      Animal         |
+----------------------+
| - especie: String   |
| - edad: int         |
| - habitat: String   |
+----------------------+
| + mostrarInformacion(): void |
+----------------------+
