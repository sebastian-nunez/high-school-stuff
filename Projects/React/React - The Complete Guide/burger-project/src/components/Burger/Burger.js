import React from "react";
import styles from "./Burger.module.scss";
import BurgerIngredient from "./BurgerIngredient/BurgerIngredient";

const burger = (props) => {
  // const transformedIngredients = Object.keys(props.ingredients)
  //   .map(type => {
  //     return [...Array(props.ingredients[type])]
  //       .map((_, index) => {
  //         return (
  //           <BurgerIngredient type={type} key={type + index} />
  //         );
  //       });
  //   })
  //   .reduce((array, item) => {
  //     return array.concat(item);
  //   }, []);
  //
  // console.log(transformedIngredients);

  let changedIngredients = [];
  for (let type in props.ingredients) {
    for (let i = 0; i < props.ingredients[type]; i++) {
      changedIngredients.push(<BurgerIngredient type={type} key={type + i} />);
    }
  }

  if (changedIngredients.length === 0) {
    changedIngredients.push(
      <p key={"no-ingredients"}>Please start adding ingredients!</p>
    );
  }

  return (
    <div className={styles.Burger}>
      <BurgerIngredient type={"bread-top"} />
      {changedIngredients}
      <BurgerIngredient type={"bread-bottom"} />
    </div>
  );
};

export default burger;
