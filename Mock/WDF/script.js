console.log(3+ +"3"+3);
console.log(+"3"+3);
console.log(3+ +"3");
console.log(3+ +"3"+3);

const para = document.getElementById("para");

para.addEventListener("mouseover", () => {
    para.style.backgroundColor = "white";
});

let a = 50;

function doSomething(a) {
    console.log(a);
    innerFunction();
    function innerFunction() {
        console.log(a);
    }
}

doSomething(a);