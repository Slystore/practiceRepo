// Javascript

// Exercise 1:

// * Reading the following statements, please indicate which information will be printed in the screen.

var numLlamadas = 0;

function calculaBinomio(a, b) {
  var cuadradoDeA = a * a;
  var cuadradoDeB = b * b;
  numLlamadas++;

  return cuadradoDeA + cuadradoDeB + 2 * a * b;
}

alert(calculaBinomio(2, 3));
alert(calculaBinomio(4, 5));
alert(numLlamadas);
alert(typeof cuadradoDeA);

// * Explain in detail the 4th output:

//     • alert(typeof(cuadradoDeA));

// Exercise 2:

// As you probably know in Javascript there is the variable type String. One of its functions is “toUpperCase”, therefore we can do the following thing:

var s2 = "Hello World!";
alert(s2.toUpperCase()); //  <- this will return: HELLO WORLD!

// How do you rewrite the above function in order to return this text (HELLO WORLD!) in small letters?

// Exercise 3:

// using the next function, the console should show the message:  “Openbravo!!!”

mostrar = function (param) {
  param();
};

// Enyo

// Exercise 1:

// What is Enyo?

// Exercise 2:
// Implement the application “Hello World” using Enyo:

// Exercise 3:
// Define a button using Enyo and after clicking on it appears the following message:

// “You have clicked on the button 'Name of the button'”

// Exercise 4:
// Implement an Ajax call using Enyo and it should return a success and fail message.
