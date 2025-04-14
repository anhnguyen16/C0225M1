// // Cách 1: khai báo hàm truyền thống (phổ biến nhất)
// // function sum(a, b) {
// //     return a + b;
// // }
//
// // Cách 2: Function assignment
// // const sum = function (a, b) {
// //     return a + b;
// // }
//
// // Cách 2: Hiện đại nhất (Arrow function)
// // const sum = (a, b) => a + b;
// // const result = sum(5, 10);
// // console.log(result);
// // // document.write(result);
//
// const sayHello = name => console.log('Hello ' + name);
// sayHello('Alice');
//

//3! = 3 * 2 * 1 = 6

// function tinhGiaiThua(number) {
//     if (number === 1) return number;
//     return number * tinhGiaiThua(number - 1);
// }
//
// console.log(tinhGiaiThua(9));

// function isEven(number) {
//     return number % 2 === 0;
// }
// const number = +prompt("Enter a number: ");
// console.log(isEven(number));

// pass-by-value
function increment(number) {
    number++;
    console.log('Biến number có giá trị là: ', number);
}

const num = 10;
increment(num);
console.log('Biến num có giá trị là: ', num); // 10

// pass-by-reference: tham chiếu
function swap(arr) {
    const temp = arr[0];
    arr[0] = arr[1];
    return;
    arr[1] = temp;
}
// const numbers = [10, 5];
// const motDaySoThanKy = numbers;
// motDaySoThanKy[1] = 99;
// console.log(numbers);
// console.log('Mảng numbers trước khi hoán đổi là: ', numbers);
// swap(numbers);
// console.log('Mảng numbers sau khi hoán đổi là: ', numbers);
