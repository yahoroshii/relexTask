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
file: file: {1, 2, 10 ,8 ,9, 10, 11, 1, 2, 3, 4, 1, 2, 3, 4, 4, 3, 2, 1}<br />
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
{"min":-49999996} <br />
<br />
<br />
request:<br />
put<br />
http://localhost:8080/api/max<br />
file:10m.txt<br />
<br />
response:<br />
{"max":49999978} <br />
<br />
request:<br />
put<br />
http://localhost:8080/api/average<br />
file:10m.txt<br />
<br />
response:<br />
{"average":7364.418442641844} <br />
<br />
<br />
request:<br />
put<br />
http://localhost:8080/api/median<br />
file:10m.txt<br />
<br />
response:<br />
{"median":25216} <br />
<br />
<br />
request:<br />
put<br />
http://localhost:8080/api/sequence/increasing<br />
file:10m.txt<br />
<br />
response:<br />
{"incSequence":[[8,9,10,11],[1,2,3,4],[1,2,3,4]]}  <br />
<br />
<br />
request: <br />
put <br />
http://localhost:8080/api/sequence/decreasing <br />
file:10m.txt <br />
<br />
response:<br />
{<br />
{"decSequence":[[47689379,42381213,30043880,12102356,-4774057,-5157723,-11217378,-23005285,-23016933,-39209115,-49148762]]}