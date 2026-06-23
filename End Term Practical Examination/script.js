function checkNumber(){

    let number =
    parseInt(document.getElementById("num").value);

    let result =
    document.getElementById("result");

    if(number % 2 === 0){

        result.innerHTML =
        "✅ " + number + " is EVEN";

        result.style.color = "green";
    }

    else{

        result.innerHTML =
        "🔥 " + number + " is ODD";

        result.style.color = "red";
    }
}