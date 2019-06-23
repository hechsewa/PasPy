program calculations;

const
  size = 5;

var
   i: integer;
   j: integer;

(* ***************************    calculating    ********************************** *)

function calculate(num1, num2: integer): integer;
var
  result: integer;
begin
   result := num1*num2 + 10 + num2/23 - 38 * num1 + size;
end;
(* **************************    main      ********************************** *)

begin
  i := 2;
  j := 5;
  calculate(i,j);

  writeln('Calculation result:');
  write(calculate);
end.