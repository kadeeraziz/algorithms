import sys, os, re, typing, asyncio, time, datetime, json, requests

# event_loop.py excercise
def get_catfact_syn() -> typing.Dict:
    url = "https://www.boredapi.com/api/activity" 
    response = requests.get(url)
    data = response.json()
    return data

async def get_catfact_asy() -> typing.Dict:
    url = "https://www.boredapi.com/api/activity"
    response = requests.get(url)
    data = response.json()
    return data['activity']


def main():
    start_time = time.time()
    for i in range(20):
        data = get_catfact_syn()
        print(data)
    end_time = time.time()
    print(f"Time taken for synchronous: {end_time - start_time}")


async def main2():
    start_time = time.time()
    for i in range(20):
        res = await get_catfact_asy()
        print(f'{i}  -  {res}')
    end_time = time.time()
    print(f"Time taken for.: {end_time - start_time}")

if __name__ == "__main__":
    asyncio.run(main2())
    main()