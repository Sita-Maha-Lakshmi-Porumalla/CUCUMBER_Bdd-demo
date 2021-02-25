Feature: Product Checkout Feature

  Scenario Outline: Check the Product Price
    Given the price of "<product>" is <price>
    When I check <quantity> of "<product>"
    Then the total price of "<product>" should be <total>



    Examples:
      | product      | price  | quantity  | total   |
      | Apple        | 20     | 8         | 160     |
      | Banana       | 40     | 4         | 160     |
      | Cucumber     | 50     | 5         | 250     |
      | Grapes       | 60     | 12        | 720     |
      | Mango        | 80     | 3         | 240     |
      | Orange       | 50     | 7         | 350     |
      | Pomegranate  | 100    | 6         | 600     |
      | Pineapple    | 70     | 15        | 1050    |
      | Raspberries  | 60     | 3         | 180     |
      | Watermelon   | 90     | 5         | 450     |
