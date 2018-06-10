import re

def search():
    countFile = 0
    with open('max.txt') as text:
        for line in text:
            if re.search(
                '(2[2-5]/Mar/2009:)((03:59:[1-5][0-9])|'
                '(0[4-7]:[0-5][0-9]:[0-5][0-9])|(08:0[0-9]:[0-5][0-9])'
                '|(08:1[0-2]:[0-5][0-9])|(08:13:[0-2][0-9])|(08:13:3[0-2])).*(GET|POST).*(\s4[0-9][0-9]\s)'


                ,str(line)):
                print(line)
                countFile += 1
        print(countFile)
if __name__ == "__main__":
    search()
