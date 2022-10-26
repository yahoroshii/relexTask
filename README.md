EXAMPLE:


request:<br />
put  <br />
http://localhost:8080/api/min <br />
file: {1, 2, 10 ,8 ,9, 10, 11, 1, 2, 3, 4, 1, 2, 3, 4, 4, 3, 2, 1}
<br />
<br />
response:<br />
{<br />
    "min": 1<br />
}<br />
<br />
<br />
request:<br />
put  <br />
http://localhost:8080/api/max <br />
file: file: {1, 2, 10 ,8 ,9, 10, 11, 1, 2, 3, 4, 1, 2, 3, 4, 4, 3, 2, 1}<br />
<br />
response:<br />
{<br />
    "max": 11<br />
}<br />
<br />
<br />
request:<br />
put  <br />
http://localhost:8080/api/average <br />
file: file: {1, 2, 10 ,8 ,9, 10, 11, 1, 2, 3, 4, 1, 2, 3, 4, 4, 3, 2, 1}<br />
<br />
response:<br />
{<br />
    "average": 4.2631578947368425<br />
}<br />
<br />
request:<br />
put  <br />
http://localhost:8080/api/median <br />
file: file: {1, 2, 10 ,8 ,9, 10, 11, 1, 2, 3, 4, 1, 2, 3, 4, 4, 3, 2, 1}<br />
<br />
response: <br />
{<br />
    "median": 3 <br />
}<br />
<br />
<br />
request: <br />
put  <br />
http://localhost:8080/api/sequence/increasing <br />
file: file: {1, 2, 10 ,8 ,9, 10, 11, 1, 2, 3, 4, 1, 2, 3, 4, 4, 3, 2, 1} <br />
<br />
response: <br />
{<br />
    "incSequence": [ <br />
        [ <br />
            8, <br />
            9, <br />
            10, <br />
            11 <br />
        ], <br />
        [ <br />
            1, <br />
            2, <br />
            3, <br />
            4 <br />
        ], <br />
        [ <br />
            1, <br />
            2, <br />
            3, <br />
            4 <br />
        ] <br />
    ] <br />
} <br />
<br />
<br />
request: <br />
put  <br />
http://localhost:8080/api/sequence/decreasing <br />
file: file: {1, 2, 10 ,8 ,9, 10, 11, 1, 2, 3, 4, 1, 2, 3, 4, 4, 3, 2, 1} <br />
<br />
response:<br />
{<br />
    "decSequence": [<br />
        [ <br />
            4, <br />
            3, <br />
            2, <br />
            1 <br />
        ] <br />
    ]<br />
}<br />
<br />
<br />
<br />
<br />
<br />
<br />
TESTS:<br />
<br />
request:<br />
put<br />
http://localhost:8080/api/min <br />
file:10m.txt <br />
<br />
response:<br />
{<br />
    "min": -49999996<br />
}<br />
<br />
<br />
request:<br />
put<br />
http://localhost:8080/api/max<br />
file:10m.txt<br />
<br />
response:<br />
{<br />
    "max": 49999978<br />
}<br />
<br />
request:<br />
put<br />
http://localhost:8080/api/average<br />
file:10m.txt<br />
<br />
response:<br />
{<br />
    "average": 7364.418442641844<br />
}<br />
<br />
<br />
request:<br />
put<br />
http://localhost:8080/api/median<br />
file:10m.txt<br />
<br />
response:<br />
{<br />
    "median": 25216<br />
}<br />
<br />
<br />
request:<br />
put<br />
http://localhost:8080/api/sequence/increasing<br />
file:10m.txt<br />
<br />
response:<br />
{<br />
    "incSequence": [ <br />
        [ <br />
            -48190694, <br />
            -47725447, <br />
            -43038241, <br />
            -20190291, <br />
            -17190728, <br />
            -6172572,  <br />
            8475960, <br />
            25205909, <br />
            48332507, <br />
            48676185 <br />
        ] <br />
    ] <br />
} <br />
<br />
<br />
request: <br />
put <br />
http://localhost:8080/api/sequence/decreasing <br />
file:10m.txt <br />
<br />
response:<br />
{<br />
{<br />
    "decSequence": [ <br />
        [ <br />
            47689379, <br />
            42381213, <br />
            30043880, <br />
            12102356, <br />
            -4774057, <br />
            -5157723, <br />
            -11217378, <br /> 
            -23005285, <br />
            -23016933,<br /> 
            -39209115, <br />
            -49148762 <br />
        ] <br />
    ] <br />
} <br />