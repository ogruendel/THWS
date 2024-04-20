section .text
global main

main:
    mov eax, 4
    mov ebx, 1
    mov ecx, mymsg
    mov edx, mylen
    int 80h

    mov eax, 1
    mov ebx, 0
    int 80h

section .data
    mymsg db "Hello World!", 0xa
    mylen equ $-mymsg
