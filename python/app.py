from sign_validator import SignValidator
from stack_sorter import StackSorter
from queue_utils import QueueUtils

def run_sign_validator():
    sign_validator = SignValidator()
    cadena1 = "{[()]}" #valido
    cadena2 = "{[(])}" # no valido
    print(f"Cadena: {cadena1} es valida? {sign_validator.is_valid(cadena1)}")
    print(f"Cadena: {cadena2} es valida? {sign_validator.is_valid(cadena2)}")
    print()

def run_stack_sorter():
    stack = [5, 1, 4, 2]

    sorter = StackSorter()

    print("Stack original:", stack)
    sorter.sort(stack)
    print("Stack ordenado:", stack)
    print()

def run_queue_palindrome():
    queue_utils = QueueUtils()
    pruebas = ["ana", "radar", "java"]

    for texto in pruebas:
        print(f"Texto: {texto} es palindromo? {queue_utils.is_palindrome(texto)}")


if __name__ == "__main__":
    run_sign_validator()
    run_stack_sorter()
    run_queue_palindrome()