const cars = ["maruti", "hyundia", "ford"];

// console.log(typeof(cars));

// changing elements of array
/*
cars[0] = "audi";
console.log(cars[0]);
*/

// accesing the full array
// document.getElementById("demo").innerHTML = cars

// arrat methods for

// 1. array length
// console.log(cars.length);

// 2. looping in array
// using for loop
/*
for(let i=0;i<cars.length;i++)
    console.log(cars[i]);
*/
// using for each

// 3. adding elements to end
/*
cars.push("suzuki");
console.log(cars[cars.length-1]);
*/

// 4. arrays to strings
// console.log(cars.toString());
// console.log(cars.join("+"));

// 5. deleting last element
// console.log(cars.pop());
// console.log(cars.toString());

// 6. for shifting array by one lower index
// console.log(cars.shift());
// console.log(cars.toString());

// 7. for inserting element at beginning of array
// cars.unshift("bently");
// console.log(cars.toString());

// 8. merging two arrays
// const bikes = ["bajaj","honda","hero"];
// const array = bikes.concat(cars); // we need to store it in saperate array
// console.log(array.toString());

// 9. splicing adds new items to an array
// cars.splice(1,1,"honda");
// first parameter is for location
// second parameter is for how many elemets to be removed
// console.log(cars.toString());

// 10. slicing slices out a piece of an array
// cuts a array into subarray
// let cars1 = cars.slice(0,3);
// console.log(cars1.toString());

// 11. sorting a array alphabetically
// cars.sort();
//console.log(cars.toString()); //ford,hyundia,maruti

// 12. reversing a array
// cars.reverse();
// console.log(cars.toString()); //ford,hyundia,maruti

// adding your own function
/*Array.prototype.average = function () {
  let sum = 0;
  for (let i = 0; i < this.length; i++) {
    sum += this[i];
  }
  return sum / this.length;
};

const arr = [1, 2, 3, 4, 5, 10];
console.log(arr.average());

for (const x of arr) console.log(x);
*/
// map
// const newMap = new Map([
//     ["Name","Anurag"],
//     ["Work","Student"],
//     ["Address","Bilaspur"]
// ]);

// for(const x of newMap) console.log(x);


// set

// ESSENTIAL SET METHODS

/*

Method	Description

new Set()	Creates a new Set
add()	Adds a new element to the Set
delete()	Removes an element from a Set
has()	Returns true if a value exists in the Set
forEach()	Invokes a callback for each element in the Set
values()	Returns an iterator with all the values in a Set

Property	Description
size	Returns the number of elements in a Set




const newSet = new Set(["Anurag","Deepesh","Shail","Kamal"]);

newSet.add("Dharni");

// console.log(newSet);
// for(const x of newSet) console.log(x);

// delete

// newSet.delete("Anurag");
// let text = "";
// for(const x of newSet) text+=x;
// console.log(text);

*/


/**
 * MAP
 * 
 * 
 * Essential Map Methods
Method	Description
new Map()	Creates a new Map
set()	Sets the value for a key in a Map
get()	Gets the value for a key in a Map
delete()	Removes a Map element specified by the key
has()	Returns true if a key exists in a Map
forEach()	Calls a function for each key/value pair in a Map
entries()	Returns an iterator with the [key, value] pairs in a Map
Property	Description
size	Returns the number of elements in a Map
 */


// map creation

// const newMap = new Map([["Name","Anurag"],["Kaam","Pdhai"]]);

// newMap.set("Name","Deepesh");

// console.log(newMap);


// ARROW FUNCTION

// hello = () =>{
//     return "hello world !";
// }

// console.log(hello());

Array.prototype.average = function(){
  let sum = 0;
  console.log(this.length);
  for(let i=0;i<this.length;i++){
      sum+=this[i];
  }
  console.log(sum);
  return sum/this.length;
  // return this.sum/this.length;
};


const arr = [1,2,3,4,5];
console.log(arr.average());