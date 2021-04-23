<?php
require_once 'account.php';

class Car {
    public $id;
    public $license;
    public $driver;
    public $passenger;

    public function __construct($license, Account $driver) {
        $this->license = $license;
        $this->driver = $driver;
    }

    function printDataCar() {
        echo "License: ".$this->license. " Driver: ".$this->driver->name. " Document: ".$this->document;
    }
}

?>