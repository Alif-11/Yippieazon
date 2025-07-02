import { Request, Response } from 'express';


// @desc Get all shopping cart items this user has
// @route GET /api/shopping-cart/items/:id
export const getCartItems = (async (req: Request, res: Response, next) => {
  // Need this try catch block for every function you make
  try {
    const userId = req.params.id;
    // Get User
    // Get User Shopping Cart
    // Get Items in the User Shopping Cart
    // Return those Items

  } catch (err) {
    next(err);
  }

})