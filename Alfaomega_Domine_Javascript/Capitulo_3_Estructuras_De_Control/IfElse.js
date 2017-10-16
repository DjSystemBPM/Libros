/**
 * 
 */

var edad;

edad = prompt("Introduzca su edad (en numeros)", "");

edad = parseInt(edad);

if(edad === 18){
	alert("Tu tienes 18 años");
} else if (edad < 18) {
	alert("Usted tiene menos de 18 años.");
} else {
	alert("Usted es mayor de 18 años");
}