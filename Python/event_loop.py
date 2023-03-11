import sys, os, re, typing, asyncio, time, datetime, json, requests

# event_loop.py excercise
def get_catfact_syn() -> typing.Dict:
    url = "https://catfact.ninja/fact" 
    response = requests.get(url)
    data = response.json()
    return data

async def get_catfact_asy() -> typing.Dict:
    url = "https://catfact.ninja/fact"
    response = requests.get(url)
    data = response.json()
    return data


def main():
    start_time = time.time()
    for i in range(10):
        data = get_catfact_syn()
        print(data)
    end_time = time.time()
    print(f"Time taken for synchronous: {end_time - start_time}")

    start_time = time.time()
    loop = asyncio.new_event_loop()
    asyncio.set_event_loop(loop)
    tasks = [loop.create_task(get_catfact_asy()) for i in range(10)]
    loop.run_until_complete(asyncio.wait(tasks))
    end_time = time.time()
    print(f"Time taken for asynchronous: {end_time - start_time}")


if __name__ == "__main__":
    main()