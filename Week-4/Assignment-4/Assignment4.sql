SELECT * FROM assignment.user;

CREATE TABLE article (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    content TEXT,
    author_id INT,
    FOREIGN KEY (author_id) REFERENCES user(id)
);

SELECT * FROM assignment.article;

INSERT INTO article (title, content, author_id) VALUES
('First Article', 'This is the content of the first article.', 1),
('Second Article', 'This is the content of the second article.', 2),
('Third Article', 'This is the content of the third article.', 1),
('Fourth Article', 'This is the content of the fourth article.', 2),
('Fifth Article', 'This is the content of the fifth article.', 1),
('Sixth Article', 'This is the content of the sixth article.', 2),
('Seventh Article', 'This is the content of the seventh article.', 1),
('Eighth Article', 'This is the content of the eighth article.', 2),
('Ninth Article', 'This is the content of the ninth article.', 1),
('Tenth Article', 'This is the content of the tenth article.', 2),
('Eleventh Article', 'This is the content of the eleventh article.', 1),
('Twelfth Article', 'This is the content of the twelfth article.', 2),
('Thirteenth Article', 'This is the content of the thirteenth article.', 1),
('Fourteenth Article', 'This is the content of the fourteenth article.', 2),
('Fifteenth Article', 'This is the content of the fifteenth article.', 1),
('Sixteenth Article', 'This is the content of the sixteenth article.', 2),
('Seventeenth Article', 'This is the content of the seventeenth article.', 1),
('Eighteenth Article', 'This is the content of the eighteenth article.', 2),
('Nineteenth Article', 'This is the content of the nineteenth article.', 1),
('Twentieth Article', 'This is the content of the twentieth article.', 2),
('Twenty-First Article', 'This is the content of the twenty-first article.', 1),
('Twenty-Second Article', 'This is the content of the twenty-second article.', 2),
('Twenty-Third Article', 'This is the content of the twenty-third article.', 1),
('Twenty-Fourth Article', 'This is the content of the twenty-fourth article.', 2),
('Twenty-Fifth Article', 'This is the content of the twenty-fifth article.', 1),
('Twenty-Sixth Article', 'This is the content of the twenty-sixth article.', 2),
('Twenty-Seventh Article', 'This is the content of the twenty-seventh article.', 1),
('Twenty-Eighth Article', 'This is the content of the twenty-eighth article.', 2),
('Twenty-Ninth Article', 'This is the content of the twenty-ninth article.', 1),
('Thirtieth Article', 'This is the content of the thirtieth article.', 2);

SELECT article.id, article.title, article.content, article.author_id, user.email AS author_email
FROM article
JOIN user ON article.author_id = user.id;

SELECT * 
FROM article
ORDER BY id
LIMIT 6, 6; 
