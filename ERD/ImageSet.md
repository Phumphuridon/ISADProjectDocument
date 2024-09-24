# ImageSet
[```ERDDiagram```](/ERD/ERDDiagram.md)::[```ImageSet```](/ERD/ImageSet.md)

## Table

| Field | Type | Null | Key | Default | Extra |
|-----|-----|-----|-----|-----|-----|
| imageset_id | int(11) | NO | PRI | NULL | auto_increment |
| image1 | mediumblob | NO |  | NULL |  |
| image2 | mediumblob | NO |  | NULL |  |
| image3 | mediumblob | NO |  | NULL |  |
| image4 | mediumblob | NO |  | NULL |  |
| image5 | mediumblob | NO |  | NULL |  |

## Code
```MySQL
CREATE TABLE IMAGESET(
	imageset_id INT(11) AUTO_INCREMENT PRIMARY KEY,
	image1 MEDIUMBLOB NOT NULL,
	image2 MEDIUMBLOB NOT NULL,
	image3 MEDIUMBLOB NOT NULL,
	image4 MEDIUMBLOB NOT NULL,
	image5 MEDIUMBLOB NOT NULL
);
```

## Related Entities

| Entity | Cardinality | Reference Name | Relationship |
|-----|-----|-----|-----|
| [Boardgame](/ERD/Boardgame.md) | 0..1 |  |   (Boardgame—ImageSet) |

