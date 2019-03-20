(ns hello-webpack.core
  (:require [goog.dom :as gdom]
            [reagent.core :as r]))

(defn simple-component []
  [:div
   [:p "I am a component!"]
   [:p.someclass
    "I have " [:strong "bold"]
    [:span {:style {:color "red"}} " and red "] "text."]])

(r/render [simple-component] (gdom/getElement "app"))
