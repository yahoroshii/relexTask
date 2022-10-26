EXAMPLE:


request:<br />
put  <br />
http://localhost:8080/api/min <br />
file: {1, 2, 10 ,8 ,9, 10, 11, 1, 2, 3, 4, 1, 2, 3, 4, 4, 3, 2, 1}
<br />
<br />
response:<br />
{"min":1}  <br />
<br />
<br />
request:<br />
put  <br />
http://localhost:8080/api/max <br />
file: {1, 2, 10 ,8 ,9, 10, 11, 1, 2, 3, 4, 1, 2, 3, 4, 4, 3, 2, 1}<br />
<br />
response:<br />
{"max":11} <br />
<br />
<br />
request:<br />
put  <br />
http://localhost:8080/api/average <br />
file: {1, 2, 10 ,8 ,9, 10, 11, 1, 2, 3, 4, 1, 2, 3, 4, 4, 3, 2, 1}<br />
<br />
response:<br />
{"average":4.2631578947368425} <br />
<br />
request:<br />
put  <br />
http://localhost:8080/api/median <br />
file: {1, 2, 10 ,8 ,9, 10, 11, 1, 2, 3, 4, 1, 2, 3, 4, 4, 3, 2, 1}<br />
<br />
response: <br />
{"median":3} <br />
<br />
<br />
request: <br />
put  <br />
http://localhost:8080/api/sequence/increasing <br />
file: {1, 2, 10 ,8 ,9, 10, 11, 1, 2, 3, 4, 1, 2, 3, 4, 4, 3, 2, 1} <br />
<br />
response: <br />
{"incSequence":[[8,9,10,11],[1,2,3,4],[1,2,3,4]]}  <br />
<br />
<br />
request: <br />
put  <br />
http://localhost:8080/api/sequence/decreasing <br />
file: {1, 2, 10 ,8 ,9, 10, 11, 1, 2, 3, 4, 1, 2, 3, 4, 4, 3, 2, 1}<br />
<br />
response:<br />
{"decSequence":[[4,3,2,1]]} <br />
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
{ <br />
&nbsp;&nbsp;&nbsp; "min":-49999996 <br />
} <br />
<br />
<br />
request:<br />
put<br />
http://localhost:8080/api/max<br />
file:10m.txt<br />
<br />
response:<br />
{ <br />
&nbsp;&nbsp;&nbsp;"max":49999978 <br />
} <br />
<br />
request:<br />
put<br />
http://localhost:8080/api/average<br />
file:10m.txt<br />
<br />
response:<br />
{ <br />
&nbsp;&nbsp;&nbsp; "average":7364.418442641844 <br />
} <br />
<br />
<br />
request:<br />
put<br />
http://localhost:8080/api/median<br />
file:10m.txt<br />
<br />
response:<br />
{ <br />
&nbsp;&nbsp;&nbsp;"median":25216 <br />
} <br />
<br />
<br />
request:<br />
put<br />
http://localhost:8080/api/sequence/increasing<br />
file:10m.txt<br />
<br />
response:<br />
{ <br />
"incSequence": [ { <br />
[ <br />
&nbsp;&nbsp;&nbsp;-48190694,    <br />
&nbsp;&nbsp;&nbsp;-47725447,  <br />
&nbsp;&nbsp;&nbsp;-43038241,  <br />
&nbsp;&nbsp;&nbsp;-20190291,  <br />
&nbsp;&nbsp;&nbsp;-17190728, <br />
&nbsp;&nbsp;&nbsp;-6172572,  <br />
&nbsp;&nbsp;&nbsp;8475960,  <br /> 
&nbsp;&nbsp;&nbsp;25205909,  <br />
&nbsp;&nbsp;&nbsp;48332507,  <br />
&nbsp;&nbsp;&nbsp;48676185  <br />
&nbsp;&nbsp;]  <br />
]
}
<br />
<br />
request: <br />
put <br />
http://localhost:8080/api/sequence/decreasing <br />
file:10m.txt <br />
<br />
response:<br />
 {<br />"decSequence":
[ <br />
&nbsp;&nbsp;[ <br />
&nbsp;&nbsp;&nbsp; 47689379, <br />
&nbsp;&nbsp;&nbsp; 42381213, <br />
&nbsp;&nbsp;&nbsp; 30043880, <br />
&nbsp;&nbsp;&nbsp; 12102356, <br />
&nbsp;&nbsp;&nbsp;-4774057, <br />
&nbsp;&nbsp;&nbsp;-5157723, <br />
&nbsp;&nbsp;&nbsp;-11217378, <br />
&nbsp;&nbsp;&nbsp;-23005285, <br />
&nbsp;&nbsp;&nbsp;-23016933, <br />
&nbsp;&nbsp;&nbsp;-39209115, <br />
&nbsp;&nbsp;&nbsp;-49148762 <br />
&nbsp;&nbsp;] <br />
&nbsp;] <br />
}