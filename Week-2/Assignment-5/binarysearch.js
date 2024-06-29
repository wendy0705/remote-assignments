function binarySearchPosition(numbers, target) { // your code here

    let first = 0;
    let last = numbers.length - 1;

    while(first <= last){
        let mid = Math.floor((last + first)/2);

        if(numbers[mid] > target){
            last = mid - 1;
        }else if(numbers[mid] < target){
            first = mid + 1;
        }else{
            return mid;
        }
    }

    return -1;//找不到值
    
}

console.log(binarySearchPosition([1, 2, 5, 6, 7], 1)); // should print 0
console.log(binarySearchPosition([1, 2, 5, 6, 7], 6)); // should print 3