import random

responses = {
    "hi": ["Hello and welcome to our pizza restaurant! "
           "Hi there, thanks for choosing our pizza restaurant! "
           "Welcome! What can we do for you today? "],
    "hello": ["Hello and welcome to our pizza restaurant! "
              "Hi there, thanks for choosing our pizza restaurant! "
              "Welcome! What can we do for you today? "],
    "menu": ["We have cheese, pepperoni, and veggie pizzas. "
             "Our menu includes margherita, BBQ chicken, and Hawaiian pizzas. "
             "We offer thin crust, deep dish, and stuffed crust pizzas. "],
    "hours": ["We're open from 11am to 10pm every day. "
              "Our hours are 10am to 9pm Monday through Friday, and 11am to 10pm on weekends. "],
    "delivery": ["Yes, we offer delivery within a 5-mile radius of our restaurant. "
                 "We can deliver your pizza right to your door! "],
    "thanks": ["You're welcome!",
               "No problem, enjoy your pizza!",
               "Thank you for choosing our restaurant!"],

    "default": ["Sorry, I don't understand what you're asking."]
}


def get_response(message):
    if message in responses:
        return random.choice(responses[message])
    else:
        return random.choice(responses["default"])


print("****************Welcome Guest !****************\nHi, I'm your friendly pizza chatbot. How can I assist you today?\nIf you want to end the converstion type *Stop*\n")

message = input("You :")

while message != "stop":

    response = get_response(message)
    print("Chatbot:", response)
    message = input("You: ")
    if message not in responses:
        print("\n Thank-You")
