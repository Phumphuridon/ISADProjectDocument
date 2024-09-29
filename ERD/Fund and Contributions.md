"ตาราง FUND"
| FIELD         | TYPE          | NULL  | KEY | Default | EXTRA           |
|---------------|---------------|-------|-----|---------|-----------------|
| fund_id       | int(11)       | NO    | PRI | NULL    | AUTO_INCREMENT  |
| title         | varchar(50)   | NO    |     | NULL    |                 |
| Description   | varchar(3500) | YES   |     | NULL    |                 |
| goal_amount   | int(11)       | NO    |     | NULL    |                 |
| raised_amount | int(11)       | NO    |     | 0       |                 |

"ตาราง Contributions"
| FIELD           | TYPE          | NULL  | KEY | Default |
|-----------------|---------------|-------|-----|---------|
| contribution_id | int(11)       | NO    | PRI | NULL    |
| user_id         | int(11)       | NO    | MUL | NULL    |
| fund_id         | int(11)       | NO    | MUL | NULL    |
| amount          | int(11)       | NO    |     | NULL    |

ER DIAGRAM
![image](https://github.com/user-attachments/assets/a23a414e-34de-43f6-a8a0-33cc252f603b)
