from car import Car
from account import Account

def run():
    account = Account("Andres Herrera", "ASD333")
    car = Car("ACV123", account)
    print(vars(car))
    print(vars(car.driver))

if __name__ == "__main__":
    run()