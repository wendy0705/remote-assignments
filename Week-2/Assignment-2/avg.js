function avg(data) {
    // your code here
    let sum = 0;
    let products = data.products;
    for(let i = 0; i < products.length; i++){
        sum += products[i].price;
    }
    return sum / products.length;
}
console.log(
    avg ({
        size: 3,
        products: [
            {
                name: 'Product 1',
                price: 100,
            },
            {
                name: 'Product 2',
                price: 700,
            },
            {
                name: 'Product 3',
                price: 250,
            },
        ],
    })
); // should print the average price of all products