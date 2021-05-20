// Se da una frase y una palabra y muestra cuantas veces aparece esa palabra en la frase dada
//Ejemplo ("¡Hola! ¿Todo bien? Espero que esten bien, saludos.", "bien") debe dar 2

function wordCounter(phrase, search) {
  let counter = 0;
  let clean_text = phrase.toLowerCase().replace(/[!¡.,-?¿]/gi, "");
  let divided_text = clean_text.split(" ");

  if (divided_text.includes(search)) {
    for (word of divided_text) {
      if (search == word) counter++;
    }
    return counter;

  } else return counter;
}

let res = wordCounter("¡Hola! ¿Todo bien? Espero que esten bien, saludos.", "bien");

console.log("La cantidad de veces que aparece esta palabra en esta frase es : "+ res);
