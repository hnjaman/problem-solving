if __name__ == '__main__':
    n = int(raw_input())
    m = raw_input()                         # 1 2  
    m2 = m.split()                          # ['1', '2']
    integer_list = map(int, m2)             # [1, 2]
    t=tuple(integer_list)                   # (1, 2)
    print t.__hash__()