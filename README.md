EXAMPLE:


request:
put  
http://localhost:8080/api/min
file: {1, 2, 10 ,8 ,9, 10, 11, 1, 2, 3, 4, 1, 2, 3, 4, 4, 3, 2, 1}

response:
{
    "min": 1
}


request:
put  
http://localhost:8080/api/max
file: file: {1, 2, 10 ,8 ,9, 10, 11, 1, 2, 3, 4, 1, 2, 3, 4, 4, 3, 2, 1}

response:
{
    "max": 11
}


request:
put  
http://localhost:8080/api/average
file: file: {1, 2, 10 ,8 ,9, 10, 11, 1, 2, 3, 4, 1, 2, 3, 4, 4, 3, 2, 1}

response:
{
    "average": 4.2631578947368425
}

request:
put  
http://localhost:8080/api/median
file: file: {1, 2, 10 ,8 ,9, 10, 11, 1, 2, 3, 4, 1, 2, 3, 4, 4, 3, 2, 1}

response:
{
    "median": 3
}


request:
put  
http://localhost:8080/api/sequence/increasing
file: file: {1, 2, 10 ,8 ,9, 10, 11, 1, 2, 3, 4, 1, 2, 3, 4, 4, 3, 2, 1}

response:
{
    "incSequence": [
        [
            8,
            9,
            10,
            11
        ],
        [
            1,
            2,
            3,
            4
        ],
        [
            1,
            2,
            3,
            4
        ]
    ]
}


request:
put  
http://localhost:8080/api/sequence/decreasing
file: file: {1, 2, 10 ,8 ,9, 10, 11, 1, 2, 3, 4, 1, 2, 3, 4, 4, 3, 2, 1}

response:
{
    "decSequence": [
        [
            4,
            3,
            2,
            1
        ]
    ]
}






TESTS:

request:
put
http://localhost:8080/api/min
file:10m.txt

response:
{
    "min": -49999996
}


request:
put
http://localhost:8080/api/max
file:10m.txt

response:
{
    "max": 49999978
}

request:
put
http://localhost:8080/api/average
file:10m.txt

response:
{
    "average": 7364.418442641844
}


request:
put
http://localhost:8080/api/median
file:10m.txt

response:
{
    "median": 25216
}


request:
put
http://localhost:8080/api/sequence/increasing
file:10m.txt

response:
{
    "incSequence": [
        [
            -48190694,
            -47725447,
            -43038241,
            -20190291,
            -17190728,
            -6172572,
            8475960,
            25205909,
            48332507,
            48676185
        ]
    ]
}


request:
put
http://localhost:8080/api/sequence/decreasing
file:10m.txt

response:
{
{
    "decSequence": [
        [
            47689379,
            42381213,
            30043880,
            12102356,
            -4774057,
            -5157723,
            -11217378,
            -23005285,
            -23016933,
            -39209115,
            -49148762
        ]
    ]
}