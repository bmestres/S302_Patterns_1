
# Assignment S302. Patterns 1
Implementation of SOLID principles through several design patterns.

**Technologies**: Backend Java

**Prerequisites:**<br>
* **Maven**: Required to download external dependencies: JUnit API and Params for testing.

**Installation and Compilation**:

1. Clone repository:<br>
   https://github.com/bmestres/S302_Patterns_1.git
2. Navigate to the project root directories:<br>
   `cd tascaS302`
3. Resolve dependencies and compile the project using Maven:<br>
   `mvn clean compile`

## Level 1:
Implementation of an **Undo Class** that replicates the classic *undo* functionality, using a **Singleton
pattern** to ensure there's only one instance with global access of the class within the Application.

#### Singleton project structure:
````text
.
├── pom.xml
└── src
├── main
│   ├── java
│   │   └── Undo.java
│   └── resources
└── test
└── java
└── UndoTest.java
````

## Level 2:
Implementation of an **international phone and address manager**
using the **Abstract Factory** pattern.

#### Abstract Factory project structure:
````text
.
├── pom.xml
├── README.md
└── src
    ├── main
    │   ├── java
    │   │   ├── Address.java
    │   │   ├── Contact.java
    │   │   ├── ContactFactory.java
    │   │   ├── Phone.java
    │   │   ├── SpainAddress.java
    │   │   ├── SpainContactFactory.java
    │   │   ├── SpainPhone.java
    │   │   ├── USAAddress.java
    │   │   ├── USAContactFactory.java
    │   │   └── USAPhone.java
    │   └── resources
    └── test
        └── java
            └── ContactTest.java
````