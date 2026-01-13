user_ticker = input("\nEnter a ticker symbol to look up: ").upper()

print("\n------ Company Info ------")
try:
    stock = yf.Ticker(user_ticker)
    info = stock.info

    if isinstance(info, dict):
        name = info.get("longName", "Data not available")
        price = info.get("regularMarketPrice", "Data not available")
        website = info.get("website", "Data not available")
    else:
        name = price = website = "Data not available"

    print(f"Ticker: {user_ticker}")
    print(f"Name: {name}")
    print(f"Website: {website}")
    print(f"Current Price: ${price}")
    print("----------------------------------------")
    except Exception as e:
    print(f"Could not get data for {user_ticker}: {e}")
