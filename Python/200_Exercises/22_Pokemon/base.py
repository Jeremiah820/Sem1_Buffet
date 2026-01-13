import requests

pokemon = requests.get("https://pokeapi.co/api/v2/pokemon/pikachu").json()

x = input("Please enter a pokemon: " )
pokemon = requests.get("https://pokeapi.co/api/v2/pokemon/" + x).json()

print(pokemon["name"])
print(pokemon["height"])
print(pokemon["weight"])
print(pokemon[""]) 

# Use this JSON formatter to better visualize the JSON from the Pokemon website
# https://jsonformatter.org/json-viewer

