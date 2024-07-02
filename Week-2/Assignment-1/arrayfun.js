function max(numbers) {
    // your code here, for-loop method preferred
    let max = -Infinity; //從0改成負無限大，可以解決輸入值小於0的情況
    for(let number of numbers){
        if(number > max){
            max = number;
        }
    }
    return max;
}

function findPosition (numbers, target) {
    // your code here, for-loop method preferred
    let position = -1;
    for(let i = 0; i < numbers.length; i++){//將迴圈從let number of numbers改成用index i來跑，便可以直接讀i = target在numbers中的位置
        if(numbers[i] == target){
            position = i;
            return position;
        }
    }
    return position;
}

console.log(max([1, 2, 4, 5])); // should print 5
console.log(max([5, 2, 7, 1, 6])); // should print 7

console.log(findPosition([5, 2, 7, 1, 6], 5)); // should print 0
console.log(findPosition([5, 2, 7, 1, 6], 7)); // should print 2
console.log(findPosition([5, 2, 7, 7, 7, 1, 6], 7)); // should print 2 (the first position)
console.log(findPosition([5, 2, 7, 1, 6], 8)); // should print -1






