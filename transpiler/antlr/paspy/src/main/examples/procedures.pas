program add;

(*** Simple program to add 2 integers ***)

const
  size = 5;

var
   i: integer;
   j: integer;
   max: integer;

(* ***************************    adder    ********************************** *)

(* function returning the max between two numbers *)
function max(num1, num2: integer): integer;
var
   (* local variable declaration *)
   result: integer;

begin
   if num1 > num2 then
      result := num1
   else
      result := num2;
   max := result;
end;
(* **************************    main      ********************************** *)

begin
  i := 4;
  j := 6;
  max(i,j);

  writeln('Result:');
  write(max);
  writeln;
end.