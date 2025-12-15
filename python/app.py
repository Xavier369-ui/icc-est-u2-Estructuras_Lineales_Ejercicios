from sign_validator import SignValidator

def run_sign_validator():
    sign_validator = SignValidator()
    cadena1 = "{[()]}" #valido
    cadena2 = "{[(])}" # no valido
    print(f"Cadena: {cadena1} es valida? {sign_validator.is_valid(cadena1)}")
    print(f"Cadena: {cadena2} es valida? {sign_validator.is_valid(cadena2)}")


if __name__ == "__main__":
    run_sign_validator()