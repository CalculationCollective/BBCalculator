Print "Blitz3D Calculator"
Print "------------------"

Num1#=Input("Enter the first number: ")
Print ""

Num2#=Input("Enter the second number: ")
Print ""

Print "Choose a operation:"
Print "1) Addition"
Print "2) Subtraction"
Print "3) Division"
Print "4) Multiplication"
calcType%=Input("")
Print ""

If calcType = 1 Then
Print "Result: "
Write Num1+Num2
ElseIf calcType = 2 Then
Print "Result: "
Write Num1-Num2
ElseIf calcType = 3 Then
Print "Result: "
Write Num1/Num2
ElseIf calcType = 4 Then
Print "Result: "
Write Num1*Num2
EndIf