program orgate;

var
  op1: integer;
  op2: integer;
  result: integer;

    (* **************************    main      ********************************** *)
begin
  op1 := 0;
  op2 := 1;
  result := 0;
  (* checking the OR gate *)
  if op1 = 1 then
    result := 1
  else if op2 = 1 then
    result := 1;

  writeln('Gates result:');
  write(result);
end.