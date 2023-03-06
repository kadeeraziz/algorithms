import asyncio


async def myCoroutine():
    print("Hello World!")
    await asyncio.sleep(1)
    print("Hello Again!")


async def main():
    await myCoroutine()


if __name__ == "__main__":
    asyncio.run(main())