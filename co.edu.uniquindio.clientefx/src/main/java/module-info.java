module co.edu.uniquindio.cliente.clienteapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.cliente.clienteapp.controller;
    //opens co.edu.uniquindio.cliente.clienteapp.model;
    opens co.edu.uniquindio.cliente.clienteapp to javafx.fxml;
    exports co.edu.uniquindio.cliente.clienteapp;

    exports co.edu.uniquindio.cliente.clienteapp.controller;
}