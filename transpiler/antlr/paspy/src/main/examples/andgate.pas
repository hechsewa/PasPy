program andgate;

const
  op1 = 1;

var
  op2: integer;
  result: integer;
(* **************************    and      ********************************** *)

 (* function returning the max between two numbers *)
procedure andMethod(op1, op2: integer);
var
     (* local variable declaration *)
  result: integer;

begin
  if op1 = 1 then
    if op2 = 1 then
      result := 1
    else
      result := 0;
end;

       (* **************************    main      ********************************** *)
begin
  op2 := 0;
  andMethod(op1, op2);
  writeln('Gates result:');
  write(result);
end.