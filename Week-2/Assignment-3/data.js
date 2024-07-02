function count(input) {
    // your code here
    let result;
    result = input.reduce((result, n) => {
        result[n] = (result[n]||0) + 1;//定義result[n]初始值為０
        return result;
    },{});
    return result;

}
let input1 = ["a", "b", "c", "a", "c", "a", "x"];
console.log(count(input1));
// should print {a:3, b:1, c:2, x:1}

function groupByKey(input) {
    // your code here
    let result;
    result = input.reduce((result, n) => {
        result[n.key] = (result[n.key]||0) + n.value;
    },{});
    return result;
}

let input2 = [
    { key: "a", value: 3 },
    { key: "b", value: 1 },
    { key: "c", value: 2 },
    { key: "a", value: 3 },
    { key: "c", value: 5 },
];

console.log(groupByKey(input2));
// should print {a:6, b:1, c:7}