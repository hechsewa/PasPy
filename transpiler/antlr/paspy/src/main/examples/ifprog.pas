program ifprog;
 
(*** Demonstrate the if.  ***)
 
var
   number: integer;
 
(* **************************    main      ********************************** *)
 
begin
  number := 50;
 
  write('If this was a grade, you would receive a grade of:  ');
  if number >= 90 then
     write('A')
  else if number >= 80 then
     write('B')
  else if number >= 70 then
     write('C')
  else if number >= 60 then
     write('D')
  else
     write('F');
  writeln;
end.