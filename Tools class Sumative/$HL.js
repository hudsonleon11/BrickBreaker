//Name: Hudson Leon
// Tools Class
// Last update: May 4, 2018

//This function displays an alert


function myToolsClass() {
    alert("TOOLS CLASS WORKING!!")
}

// Generates a random integer between a
function genRandom(a) {
    return parseInt(Math.random()*a);
}

//Gets all the letters of a string
// and prints them all out
function googleInterview1(str) {

    for(i = 0; i < str.length; i = i + 1) {
        console.log(str[i])
    }
}

//Adds up all the digits of a number together
// num is an integer

function sumDigits(num) {

    var total = 0;
    var str = num.toString();

    for(i = 0; i < str.length; i = i + 1) {

        console.log(str.substring(i,i+1))
        total = total + parseInt(str.substring(i,i+1));

    }


    console.log(total);
    return total;

}
// finds the sum of all numbers divisible by 3 then divisible by 5 within the number a

function fivetothree(x) {

    var total = 0;


    for (i = 1; i < x ; i = i + 1 ) {
        if (i % 5 == 0) {
            total = total + i;
        }
        else if (i % 3 == 0) {
            total = total + i;
        }
    }
    return total;
}



