<?php
require_once('./Car.php');
require_once('./uberX.php');
require_once('./uberPool.php');
require_once('./Account.php');

$uberX = new UberX("CVB123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Spark");
$uberX->PrintDataCar();

$uberPool = new UberPool("SDF234", new Account("Paco Herrera", "ANF543"), "Dodge", "Charger");
$uberPool->PrintDataCar();
