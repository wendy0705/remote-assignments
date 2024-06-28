function count(input) {
    // your code here
    let counts = [{
        alp: 'a',
        count: 0
    },
    {
        alp: 'b',
        count: 0
    },
    {
        alp: 'c',
        count: 0
    },
    {
        alp: 'x',
        count: 0
    }];

    for(let i = 0; i < input.length; i++){
        if(input[i] === 'a'){
            counts[0].count += 1;
        }else if(input[i] === 'b'){
            counts[1].count += 1;
        }else if(input[i] === 'c'){
            counts[2].count += 1;
        }else if(input[i] === 'x'){
            counts[3].count += 1;
        }
    }

    const alpcount = counts.reduce((alpcount, num) => {
        alpcount[num.alp] = num.count;
        return alpcount;
    },{});

    return alpcount;
}
let input1 = ["a", "b", "c", "a", "c", "a", "x"];
console.log(count(input1));
// should print {a:3, b:1, c:2, x:1}

function groupByKey(input) {
    // your code here
    let output = [{
        key: 'a',
        value: 0
    },
    {
        key: 'b',
        value: 0
    },
    {
        key: 'c',
        value: 0
    }];

    for(let i = 0; i < input.length; i++){
        if(input[i].key === 'a'){
            output[0].value += input[i].value;
        }else if(input[i].key === 'b'){
            output[1].value += input[i].value;
        }else if(input[i].key === 'c'){
            output[2].value += input[i].value;
        }
    }

    const alpcount = output.reduce((alpcount, num) => {
        alpcount[num.key] = num.value;
        return alpcount;
    },{});

    return alpcount;
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