import asyncio
import time

async def say_hi_after(delay):
    await asyncio.sleep(delay)
    print("Hi!")

async def main():
    print(f"started at {time.strftime('%X')}")

    await say_hi_after(1)
    await say_hi_after(2)
    
    print(f"finished at {time.strftime('%X')}")


if __name__ == "__main__":
    asyncio.run(main())